package com.zeynepduyenli.biseyapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.core.widget.doOnTextChanged
import androidx.databinding.DataBindingUtil.setContentView
import com.zeynepduyenli.biseyapp.databinding.ActivityMainBinding

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_second_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fm = parentFragmentManager
        val ft = fm.beginTransaction()
        val button: ImageButton = view.findViewById(R.id.uyeButton)
        val girisButton: ImageButton = view.findViewById(R.id.girisButton)
        val userName: EditText = view.findViewById(R.id.editTextUser)
        val password: EditText = view.findViewById(R.id.editTextPassword)

        button.setOnClickListener {
            ft.replace(R.id.fragment, ThirdFragment())
            ft.commit()
        }

        userName.doOnTextChanged(){text, start, before, count ->
            userName.setError(null)}
        password.doOnTextChanged(){text, start, before, count ->
            password.setError(null)}


        girisButton.setOnClickListener(){
            if (userName.text.toString().isEmpty()) {
                userName.setError("Kullanıcı adı boş olamaz!!!!")
            }
            if (userName.text.toString().length < 5) {
                userName.setError("Kullanıcı adı bu kadar kısa olamaz!!!!")
            }
            if (password.text.toString().isEmpty()) {
                password.setError("Şifre boş olamaz!!!!")
            }
            if (password.text.toString().length < 8) {
                password.setError("Şifre bu kadar kısa olamaz!!!!")
            }

        }

    }

/*
    private fun validateEmail(): Boolean {
        val email = binding.editTextEmail.text.toString()

        if (email.isEmpty()) {
            binding.textInputLayoutEmail.error = getString(R.string.email_empty_error)
            return false
        }

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches().not()) {
            binding.textInputLayoutEmail.error = getString(R.string.email_invalid_error)
            return false
        }

        binding.textInputLayoutEmail.error = null
        return true
    }
*/

 /*   private fun validatePassword(): Boolean {
        val password = binding.editTextPassword.text.toString()

        if (password.length < 8) {
            binding.textInputLayoutPassword.error = getString(R.string.email_invalid_password)
            return false
        }

        binding.textInputLayoutPassword.error = null
        return true
    }
*/


  /*  private fun toast(text: String) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }*/

}


