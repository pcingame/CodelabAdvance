package com.pc.codelabadvance

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.pc.codelabadvance.databinding.FragmentSimpleBinding

class SimpleFragment : Fragment() {

    private lateinit var binding: FragmentSimpleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSimpleBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val textTitle = binding.tvArticleQuestion
            when (checkedId) {
                R.id.radioButtonYes -> textTitle.text = context?.getString(R.string.yes_message)
                R.id.radioButtonNo -> textTitle.text = context?.getString(R.string.no_message)
            }

        }

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, _, _ ->
            val myRating = getString(R.string.my_rating, ratingBar.rating.toString())
            Toast.makeText(context, myRating, Toast.LENGTH_SHORT).show()
        }
    }
}
