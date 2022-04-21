package com.example.laboratorio01.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.laboratorio01.R
import com.example.laboratorio01.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val txtEmail = root.findViewById<EditText>(R.id.txt_Email)
        val txtPasswd = root.findViewById<EditText>(R.id.txt_Password)

        val btnClick=root.findViewById<Button>(R.id.btn_Validate)
        btnClick.setOnClickListener { view ->
            if(validateEmail(txtEmail.text.toString())) {
                Toast.makeText(root.context, "Correo electronico válido", Toast.LENGTH_SHORT).show()
            }
            if( validatePassword(txtPasswd.text.toString()) ){
                Toast.makeText(root.context, "Password válido", Toast.LENGTH_SHORT).show()
            }
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun validateEmail(email: String): Boolean {
        val pattern: String = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+\$"
        val regExp: Regex = Regex(pattern)
         return regExp.matches(email)
    }
    fun validatePassword(password: String): Boolean{
        val pattern: String = "^[a-z0-9]{6}\$"
        val regExp: Regex = Regex(pattern)
        return regExp.matches(password)
    }

//    fun btn_Validate_Click(view: View){
//        Toast.makeText(this,"Click",Toast.LENGTH_LONG).show()
//    }
}