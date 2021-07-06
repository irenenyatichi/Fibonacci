package com.example.Fibonnachi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumber: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
    }

    fun castView() {
        rvNumber = findViewById(R.id.rvNumbers)
        rvNumber.layoutManager = LinearLayoutManager(baseContext)
        var numsAdapter =Reveiwfile(display(100))
        rvNumber.adapter=numsAdapter
    }

    fun display(limit: Int): List<BigInteger> {
        var begin = BigInteger.ZERO
        var next = BigInteger.ONE
        var nums = MutableList<BigInteger>(limit,{BigInteger.ZERO })
        nums[0] = begin
        nums[1] = next
            for (a in 1..limit) {
                var nums1 = begin + next
                begin = next
                next = nums1
                nums[a-1] = begin
        }
        return nums
    }
}