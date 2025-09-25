package com.example.havi_btweek5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    String[] funFacts = {
            "🐧 Chim cánh cụt có thể nhảy cao gần 2 mét dưới nước.",
            "🌙 Trên sao Hỏa có núi lửa cao gấp 3 lần Everest.",
            "🦄 Kỳ lân từng được coi là có thật trong cổ tích.",
            "🍫 Sô-cô-la từng được dùng như tiền tệ ở Trung Mỹ cổ đại.",
            "🐢 Rùa có thể thở bằng mông khi ngủ đông.",
            "🚀 Một ngày trên sao Kim dài hơn một năm của nó."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView quoteText = findViewById(R.id.quoteText);

        Random random = new Random();
        int index = random.nextInt(funFacts.length);

        quoteText.setText(funFacts[index]);
    }
}
