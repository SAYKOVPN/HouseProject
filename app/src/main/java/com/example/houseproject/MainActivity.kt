package com.example.houseproject

import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.setPadding(24, 24, 24, 24)

        val title = TextView(this)
        title.text = "🏠 Проект дома"
        title.textSize = 28f
        title.setTextColor(Color.BLACK)
        title.gravity = Gravity.CENTER
        title.setPadding(0, 20, 0, 30)

        root.addView(
            title,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        val info = TextView(this)
        info.text = """
            План дома
            
            🛏 Спальня — 4 × 4 м
            🍳 Кухня — 3 × 4 м
            🛋 Гостиная — 5 × 4 м
            🚿 Ванная — 2 × 3 м
        """.trimIndent()

        info.textSize = 20f
        info.setPadding(20, 20, 20, 30)

        root.addView(info)

        val addRoom = Button(this)
        addRoom.text = "Добавить комнату"

        addRoom.setOnClickListener {
            info.append("\n\n➕ Новая комната")
        }

        root.addView(addRoom)

        val save = Button(this)
        save.text = "Сохранить проект"

        save.setOnClickListener {
            title.text = "🏠 Проект сохранён!"
        }

        root.addView(save)

        setContentView(root)
    }
}