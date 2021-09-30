package com.example.practiceclean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practiceclean.databinding.ActivityMainBinding


//View부분.
//presenter를 갖고있으며 , View를 상속받음.

class MainActivity : AppCompatActivity(), Contract.View {
    lateinit var binding : ActivityMainBinding
    val presenter by lazy { MainPresenter(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.plus.setOnClickListener{
            presenter.calc(getFirstNum(),getSecondNum(),'+')
        }
        binding.minus.setOnClickListener{
            presenter.calc(getFirstNum(),getSecondNum(),'-')
        }
        binding.divide.setOnClickListener{
            presenter.calc(getFirstNum(),getSecondNum(),'/')
        }
        binding.multiply.setOnClickListener{
            presenter.calc(getFirstNum(),getSecondNum(),'*')
        }
    }
    override fun setCalcResult(res: Int) { binding.result.text = res.toString() }
    override fun getFirstNum(): Int = binding.leftValue.text.toString().toInt()
    override fun getSecondNum(): Int = binding.rightValue.text.toString().toInt()
}