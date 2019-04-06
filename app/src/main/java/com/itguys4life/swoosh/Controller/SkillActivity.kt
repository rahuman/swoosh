package com.itguys4life.swoosh.Controller

import android.os.Bundle
import com.itguys4life.swoosh.Utilities.EXTRA_LEAGUE
import com.itguys4life.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
}
