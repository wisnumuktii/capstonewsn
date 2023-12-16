package com.wisnumkt.capstone1.componen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wisnumkt.capstone1.R
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme

@Composable
fun MainFitur() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            "Fitur",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 3.dp)
        ) {
            FeatureItem(title = "Tukang Sayur", iconDrawableId = R.drawable.ic_vegetable)
            FeatureItem(title = "History", iconDrawableId = R.drawable.ic_history)
            FeatureItem(title = "Self Service", iconDrawableId = R.drawable.ic_self_service)
        }
    }
}

@Composable
fun FeatureItem(title: String, iconDrawableId: Int) {
    Column(
        modifier = Modifier
            .padding(8.dp), // Padding inside the column
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Circular image inside the frame
        Box(
            modifier = Modifier
                .size(48.dp) // Reduced size for a more compact look
                .clip(CircleShape) // Clip as a circle
                .background(Color.LightGray) // Set the background color of the surface
        ) {
            Icon(
                painter = painterResource(id = iconDrawableId),
                contentDescription = title,
                modifier = Modifier
                    .size(32.dp) // Reduced icon size inside the circle
                    .align(Alignment.Center) // Center the icon within the box
            )
        }

        // Text outside the box and below the surface
        Text(
            text = title,
            modifier = Modifier
                .padding(top = 4.dp) // Space between icon and text
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainFiturPreview() {
    Capstone1Theme {
        MainFitur()
    }
}