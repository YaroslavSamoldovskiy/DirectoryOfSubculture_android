package com.example.directory_of_subculture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickSubculture(view: View) {
        setContentView(R.layout.subculture)
    }

    fun onClickAlternative(view: View){
        setContentView(R.layout.alternative)
    }

    fun onClickBikers(view: View){
        setContentView(R.layout.bikers)
    }

    fun onClickEmo(view: View){
        setContentView(R.layout.emo)
    }

    fun onClickGoths(view: View){
        setContentView(R.layout.goth)
    }

    fun onClickHippies(view: View){
        setContentView(R.layout.hippies)
    }

    fun onClickMetallist(view: View){
        setContentView(R.layout.metallist)
    }

    fun onClickMods(view: View){
        setContentView(R.layout.mods)
    }

    fun onClickNewAge(view: View){
        setContentView(R.layout.new_age)
    }

    fun onClickPunks(view: View){
        setContentView(R.layout.punks)
    }

    fun onClickRastafarians(view: View){
        setContentView(R.layout.rastafarians)
    }

    fun onClickRock(view: View){
        setContentView(R.layout.rock)
    }

    fun onClickTraditionalSkinheads(view: View){
        setContentView(R.layout.traditional_skinheads)
    }

    fun onClickReturn(view:View){
        setContentView(R.layout.activity_main)
    }

    /*
    fun changeTheme(view: View){
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES)
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        else (AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES))
    }
    */

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.cng_theme->{
                if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_NO)
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                else (AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO))
            }
        }
        return super.onOptionsItemSelected(item)
    }
}