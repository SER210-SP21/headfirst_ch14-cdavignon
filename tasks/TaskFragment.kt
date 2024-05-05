package edu.quinnipiac.ser210.tasks

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import edu.quinnipiac.ser210.guessinggame.R
import edu.quinnipiac.ser210.guessinggame.databinding.FragmentTaskBinding
import androidx.lifecycle.ViewModelProvider

class TaskFragment : Fragment() {
    private var _binding: FragmentTaskBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentTaskBinding.inflate(inflater, container, false)
        val view = binding.root

        val application = requireNotNull(this.activity).application
        val dao = TaskDatabase.getInstance(application)
        val viewModelFactory = ViewModelFactory(dao)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}