/*
 * Designed and developed by 2020 jaeyun (JeongJae-yun)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.tmdb_dagger2.view.Search

import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tmdb_dagger2.R
import com.example.tmdb_dagger2.databinding.ActivitySearchBinding
import com.example.tmdb_dagger2.model.SearchInfo
import com.example.tmdb_dagger2.model.SimilarInfo
import com.example.tmdb_dagger2.view.Detail.DetailActivity
import com.example.tmdb_dagger2.view.Detail.DetailViewModel
import com.example.tmdb_dagger2.view.adapter.SearchAdapter
import com.example.tmdb_dagger2.view.adapter.SimilarListAdapter
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.activity_search.view.*

class SearchActivity : AppCompatActivity() {
    companion object{
        lateinit var searchViewModel: SearchViewModel
        lateinit var searchView : androidx.appcompat.widget.SearchView
        lateinit var activityView: View
        lateinit var searchAdapter: SearchAdapter
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        val activitySearchBinding  = DataBindingUtil.setContentView<ActivitySearchBinding>(this,R.layout.activity_search)
        activityView = activitySearchBinding.root

        initSearchAdapter()
        initRecyclerView()
        initViewModel()
        //loadSearchMovie()
    }

    private fun initRecyclerView(){
        activityView.rv_search.apply {
            layoutManager = GridLayoutManager(context,3).apply {
                orientation = GridLayoutManager.VERTICAL
            }
            setHasFixedSize(true)
            adapter = searchAdapter
        }
    }

    private fun initSearchAdapter(){
        searchAdapter = SearchAdapter(this@SearchActivity)
    }

    private fun initViewModel(){
        val movieViewModelFactory = MovieViewModelFactory()
        searchViewModel = ViewModelProviders.of(this,movieViewModelFactory).get(SearchViewModel::class.java)
    }

    private fun loadSearchMovie(){
        searchAdapter.refresh()
        searchViewModel.postSearchInfoLiveData.observe(this@SearchActivity, Observer<SearchInfo> { it ->
            it.results.forEach { result ->
                searchAdapter.setAdapterList(result.id, result.poster_path, result.title)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_upcoming_movies, menu)
        val searchItem : MenuItem = menu.findItem(R.id.search)
        initSearchView(searchItem)
        initSearchViewEditText()
        return true
    }

    private fun initSearchView(searchItem : MenuItem) {
        searchView = searchItem.actionView as androidx.appcompat.widget.SearchView
        searchView.queryHint = "Search..."
        searchView.isIconified = false;
        searchView.setOnCloseListener {
            onBackPressed()
            return@setOnCloseListener false
        }
    }

    private fun initSearchViewEditText(){
        val searchViewEditText : EditText = searchView.findViewById(androidx.appcompat.R.id.search_src_text)
        searchViewEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS

        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(s: String): Boolean {
                return false
            }

            override fun onQueryTextChange(searchText: String): Boolean {
                if (searchText.isNotEmpty()) {
                    searchViewModel.fetchSearchInfoFromRepository(searchText)
                    loadSearchMovie()
                }
                return false
            }
        })
    }
}