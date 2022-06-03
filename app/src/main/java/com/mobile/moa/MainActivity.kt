package com.mobile.moa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mobile.moa.asset.AssetFragment
import com.mobile.moa.databinding.ActivityMainBinding
import com.mobile.moa.home.HomeFragment
import com.mobile.moa.mileage.MileageFragment
import com.mobile.moa.my.MyFragment
import com.mobile.moa.pocket_book.PocketBookFragment

/* written by keh
date: 22.06.03 */

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initBottomNavigation()
    }

    private fun initBottomNavigation(){

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()

        binding.mainBnv.setOnItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.homeFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, HomeFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.assetFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, AssetFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.pocketBookFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, PocketBookFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.mileageFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MileageFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
                R.id.myFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_frm, MyFragment())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}