package com.developer.android.rickandmortyfragments.main.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

fun Fragment.replaceFragment(fragment: Fragment) {
    val fragmentManager = requireActivity().supportFragmentManager
    val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction.addToBackStack(null)
        .replace(R.id.fragment_container, fragment)
        .commit()
}