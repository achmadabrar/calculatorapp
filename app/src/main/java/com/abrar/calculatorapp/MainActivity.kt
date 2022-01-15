package com.abrar.calculatorapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var input = mutableListOf<Int>()
    private var inputs = mutableListOf<Int>()
    var subs_value = mutableListOf<Int>()
    var inputLength = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener {
            if (input.size > 0) {
                input.add(1)
                tv_number_value.text = input.toString()
            } else {
                tv_number_value.text = "1"
                input.add(1)
            }
        }

        btn_2.setOnClickListener {
            if (input.size > 0) {
                input.add(2)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "2"
                input.add(2)
            }
        }

        btn_3.setOnClickListener {
            if (input.size > 0) {
                input.add(3)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "3"
                input.add(3)
            }
        }

        btn_4.setOnClickListener {
            if (input.size > 0) {
                input.add(4)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "4"
                input.add(4)
            }
        }

        btn_5.setOnClickListener {
            if (input.size > 0) {
                input.add(5)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "6"
                input.add(5)
            }
        }

        btn_6.setOnClickListener {
            if (input.size > 0) {
                input.add(6)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "6"
                input.add(6)
            }
        }

        btn_7.setOnClickListener {
            if (input.size > 0) {
                input.add(7)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "7"
                input.add(7)
            }
        }

        btn_8.setOnClickListener {
            if (input.size > 0) {
                input.add(8)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "8"
                input.add(8)
            }
        }

        btn_9.setOnClickListener {
            if (input.size > 0) {
                input.add(9)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                tv_number_value.text = "9"
                input.add(9)
            }
        }

        btn_0.setOnClickListener {
            if (input.size > 0) {
                input.add(0)
                tv_number_value.text = input.joinToString(separator = "")
            } else {
                input.add(0)
                tv_number_value.text = "0"
            }
        }

        btn_clear.setOnClickListener {
            input.clear()
            inputs.clear()
            tv_number_value.setText("0")
        }

        add.setOnClickListener {
            if (inputs.size < 2) {
                Toast.makeText(this, "Input minimal harus 2 angka", Toast.LENGTH_SHORT).show()
            } else {
                result.text = "Hasil Add = " + inputs.sum()
            }
        }

        sub.setOnClickListener {
            if (inputs.size < 2) {
                Toast.makeText(this, "Input minimal harus 2 angka", Toast.LENGTH_SHORT).show()
            } else {
                val startIndex = 0
                var value = 0
                inputs.forEachIndexed { index, i ->
                    if (index == startIndex) {
                        value = i
                    } else {
                        value = value - i
                    }
                }

                result.text = "Hasil Substract = " + value
            }
        }

        mul.setOnClickListener {
            if (inputs.size < 2) {
                Toast.makeText(this, "Input minimal harus 2 angka", Toast.LENGTH_SHORT).show()
            } else {
                val startIndex = 0
                var value = 0
                inputs.forEachIndexed { index, i ->
                    if (index == startIndex) {
                        value = i
                    } else {
                        value = value * i
                    }
                }

                result.text = "Hasil Multiply = " + value
            }
        }

        splitEq.setOnClickListener {
            if (inputs.size < 2) {
                Toast.makeText(this, "Input minimal harus 2 angka", Toast.LENGTH_SHORT).show()
            } else {
                val startIndex = 0
                var value = 0
                inputs.forEachIndexed { index, i ->
                    if (index == startIndex) {
                        value = i
                    } else {
                        value = value / i
                    }
                }

                result.text = "Hasil SplitEq = " + value
            }
        }

        splitNum.setOnClickListener {
            if (inputs.size < 2) {
                Toast.makeText(this, "Input minimal harus 2 angka", Toast.LENGTH_SHORT).show()
            } else {
                val startIndex = 0
                var value = 0
                inputs.forEachIndexed { index, i ->
                    if (index == startIndex) {
                        value = i
                    } else {
                        value = value - i
                    }
                }

                result.text = "Hasil SplitNum = " + value
            }
        }

        btn_ok.setOnClickListener {
            if (input.size != 0) {
                val total = input.joinToString(separator = "").toInt()
                tv_number_value.text = total.toString()
                inputs.add(total)
                inputLength = 1
                input.clear()
                tv_number_list_value.text = inputs.joinToString(separator = ",")
            }
        }
    }
}