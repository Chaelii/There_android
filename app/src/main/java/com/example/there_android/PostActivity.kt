package com.example.there_android

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.there_android.databinding.ActivityAddhistoryBinding
import com.example.there_android.databinding.ActivityPostBinding

class PostActivity :AppCompatActivity() {

    lateinit var binding: ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_post)
        binding = ActivityPostBinding.inflate(layoutInflater)

        //addHistory 화면 전환
        binding.postAddHistoryIv.setOnClickListener {
            val intent = Intent(this, ActivityAddhistoryBinding::class.java)
            startActivity(intent)
        }
        openHistory()

    }

    private fun openHistory(){
        supportFragmentManager.beginTransaction().replace(R.id.post_history_fl, HistoryFragment())

        binding.postHistoryOpenIv.setOnClickListener{
            binding.postHistoryOpenIv.visibility = View.INVISIBLE
            binding.postHistoryCloseIv.visibility = View.VISIBLE
            binding.postHistoryFl.visibility = View.VISIBLE
            binding.postAddHistoryIv.visibility = View.VISIBLE
        }

        binding.postHistoryCloseIv.setOnClickListener{
            binding.postHistoryOpenIv.visibility = View.VISIBLE
            binding.postHistoryCloseIv.visibility = View.INVISIBLE
            binding.postHistoryFl.visibility = View.INVISIBLE
            binding.postAddHistoryIv.visibility = View.INVISIBLE
        }
    }

}