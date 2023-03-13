package com.livbogdan.lab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.livbogdan.lab.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

	private var _binding: FragmentAboutBinding? = null
	private val binding get() = _binding!!

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {

		_binding = FragmentAboutBinding.inflate(layoutInflater, container, false)

		val view = binding.root
		val aboutFragment = binding.aboutBtn

		aboutFragment.setOnClickListener() {
			parentFragmentManager.beginTransaction().remove(this).commit()
		}

		return view
	}



}