package com.wisnumkt.capstone1.componen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme

@Composable
fun Filter() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(0.dp),
        verticalAlignment = Alignment.Top,
        modifier = Modifier
            .fillMaxWidth()
            .height(24.dp)
            .background(color = Color(0x00000000))
            .padding(end = 8.dp) // Adjusted padding for better visibility
    ) {
        Text(
            text = "Terbaik",
            fontSize = 11.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(700),
            color = Color(0xFF00BDD6),
            modifier = Modifier
                .width(99.66666.dp)
                .height(24.dp)
                .background(color = Color(0xFFEBFDFF), shape = RoundedCornerShape(size = 12.dp))
                .padding(start = 28.83333.dp, top = 3.dp, end = 29.83333.dp, bottom = 3.dp)
            )

        Text(
            text = "Terdekat",
            fontSize = 11.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF565E6C),
            modifier = Modifier
                .width(120.dp)
                .height(24.dp)
                .padding(start = 28.83333.dp, top = 3.dp, end = 29.83333.dp, bottom = 3.dp)
            )

        Text(
            text = "Populer",
            fontSize = 11.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight(400),
            color = Color(0xFF565E6C),
            modifier = Modifier
                .width(120.dp)
                .height(24.dp)
                .padding(start = 2.dp, top = 3.dp, end = 29.83333.dp, bottom = 3.dp)
        )

    }
}

@Preview (showBackground = true)
@Composable
fun FilterPreview() {
    Capstone1Theme {
        Filter()
    }
}