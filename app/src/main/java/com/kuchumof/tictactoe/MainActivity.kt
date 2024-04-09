package com.kuchumof.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kuchumof.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var field: Array<Array<String>> = Array(3) { Array(3) { "" } }
    private val cross = "X"
    private val zero = "O"
    private var r1: Int = 0
    private var r2: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        do1()
        do2()
        do3()
        do4()
        do5()
        do6()
        do7()
        do8()
        do9()
    }

    //Ходы игрока
    private fun do1() {
        binding.button.setOnClickListener {
            field[0][0] = cross
            binding.button.text = cross
            binding.button.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do2() {
        binding.button2.setOnClickListener {
            field[0][1] = cross
            binding.button2.text = cross
            binding.button2.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do3() {
        binding.button3.setOnClickListener {
            field[0][2] = cross
            binding.button3.text = cross
            binding.button3.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do4() {
        binding.button4.setOnClickListener {
            field[1][0] = cross
            binding.button4.text = cross
            binding.button4.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do5() {
        binding.button5.setOnClickListener {
            field[1][1] = cross
            binding.button5.text = cross
            binding.button5.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do6() {
        binding.button6.setOnClickListener {
            field[1][2] = cross
            binding.button6.text = cross
            binding.button6.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do7() {
        binding.button7.setOnClickListener {
            field[2][0] = cross
            binding.button7.text = cross
            binding.button7.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do8() {
        binding.button8.setOnClickListener {
            field[2][1] = cross
            binding.button8.text = cross
            binding.button8.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    private fun do9() {
        binding.button9.setOnClickListener {
            field[2][2] = cross
            binding.button9.text = cross
            binding.button9.isEnabled = false
            proverka()
            obrat_hod()
        }
    }

    //Ходы компьютера
    fun random_comp() {
        r1 = (0 + (Math.random() * 3)).toInt()
        r2 = (0 + (Math.random() * 3)).toInt()
    }

    fun obrat_hod() {
        random_comp()
        if (field[r1][r2].equals("X") || field[r1][r2].equals("O")) {

            random_comp()
        }

        field[r1][r2] = zero
        smotr()
        proverka()
        onStart()
    }

    fun smotr() {
        //отрисовка состояния
        binding.button.setText(field[0][0])
        binding.button2.setText(field[0][1])
        binding.button3.setText(field[0][2])
        binding.button4.setText(field[1][0])
        binding.button5.setText(field[1][1])
        binding.button6.setText(field[1][2])
        binding.button7.setText(field[2][0])
        binding.button8.setText(field[2][1])
        binding.button9.setText(field[2][2])
    }

    fun proverka() = with(binding) {
        if ((button.text.equals("X")) && (button2.text.equals("X")) && (button3.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
        if ((button4.text.equals("X")) && (button5.text.equals("X")) && (button6.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
        if ((button7.text.equals("X")) && (button8.text.equals("X")) && (button9.text.equals("X"))) {
            textView.setText("Игрок победил")
        }

        //-----------------------------------------------------------------------------------------
        if ((button.text.equals("X")) && (button4.text.equals("X")) && (button7.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
        if ((button2.text.equals("X")) && (button5.text.equals("X")) && (button8.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
        if ((button3.text.equals("X")) && (button6.text.equals("X")) && (button9.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
        //-----------------------------------------------------------------------------------------
        if ((button.text.equals("X")) && (button5.text.equals("X")) && (button9.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
        if ((button3.text.equals("X")) && (button5.text.equals("X")) && (button7.text.equals("X"))) {
            textView.setText("Игрок победил")
        }
    }
}