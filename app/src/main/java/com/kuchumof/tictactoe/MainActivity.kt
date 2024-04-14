package com.kuchumof.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kuchumof.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var playingField: Array<Array<String>> = Array(3) { Array(3) { "" } }
    private val cross = "X"
    private val zero = "O"
    private var rand1: Int = 0
    private var rand2: Int = 0

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
            playingField[0][0] = cross
            binding.button.text = cross
            binding.button.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do2() {
        binding.button2.setOnClickListener {
            playingField[0][1] = cross
            binding.button2.text = cross
            binding.button2.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do3() {
        binding.button3.setOnClickListener {
            playingField[0][2] = cross
            binding.button3.text = cross
            binding.button3.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do4() {
        binding.button4.setOnClickListener {
            playingField[1][0] = cross
            binding.button4.text = cross
            binding.button4.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do5() {
        binding.button5.setOnClickListener {
            playingField[1][1] = cross
            binding.button5.text = cross
            binding.button5.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do6() {
        binding.button6.setOnClickListener {
            playingField[1][2] = cross
            binding.button6.text = cross
            binding.button6.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do7() {
        binding.button7.setOnClickListener {
            playingField[2][0] = cross
            binding.button7.text = cross
            binding.button7.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do8() {
        binding.button8.setOnClickListener {
            playingField[2][1] = cross
            binding.button8.text = cross
            binding.button8.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    private fun do9() {
        binding.button9.setOnClickListener {
            playingField[2][2] = cross
            binding.button9.text = cross
            binding.button9.isEnabled = false
            checkWin()
            computerTurn()
        }
    }

    //Ходы компьютера
    private fun randomComp() {
        rand1 = (0 + (Math.random() * 3)).toInt()
        rand2 = (0 + (Math.random() * 3)).toInt()
    }

    private fun computerTurn() {
        randomComp()
        if (playingField[rand1][rand2] == cross || playingField[rand1][rand2] == zero) {

            randomComp()
        }
        playingField[rand1][rand2] = zero
        checkDraft()
        checkWin()
        /*onStart()*/
    }


    private fun checkDraft() = with(binding) {
        //отрисовка состояния
        button.text = playingField[0][0]
        button2.text = playingField[0][1]
        button3.text = playingField[0][2]
        button4.text = playingField[1][0]
        button5.text = playingField[1][1]
        button6.text = playingField[1][2]
        button7.text = playingField[2][0]
        button8.text = playingField[2][1]
        button9.text = playingField[2][2]
    }

    private fun checkWin() = with(binding) {
        val playerWinStr: String = "Игрок победил"
        if ((button.text.equals("X")) && (button2.text.equals("X")) && (button3.text.equals("X"))) {
            textView.text = playerWinStr
        }
        if ((button4.text.equals("X")) && (button5.text.equals("X")) && (button6.text.equals("X"))) {
            textView.text = playerWinStr
        }
        if ((button7.text.equals("X")) && (button8.text.equals("X")) && (button9.text.equals("X"))) {
            textView.text = playerWinStr
        }
        //-----------------------------------------------------------------------------------------
        if ((button.text.equals("X")) && (button4.text.equals("X")) && (button7.text.equals("X"))) {
            textView.text = playerWinStr
        }
        if ((button2.text.equals("X")) && (button5.text.equals("X")) && (button8.text.equals("X"))) {
            textView.text = playerWinStr
        }
        if ((button3.text.equals("X")) && (button6.text.equals("X")) && (button9.text.equals("X"))) {
            textView.text = playerWinStr
        }
        //-----------------------------------------------------------------------------------------
        if ((button.text.equals("X")) && (button5.text.equals("X")) && (button9.text.equals("X"))) {
            textView.text = playerWinStr
        }
        if ((button3.text.equals("X")) && (button5.text.equals("X")) && (button7.text.equals("X"))) {
            textView.text = playerWinStr
        }
    }

}