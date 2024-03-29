package com.wisnumkt.capstone1.ui.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wisnumkt.capstone1.componen.Filter
import com.wisnumkt.capstone1.componen.MainTopBar
import com.wisnumkt.capstone1.componen.RekomendList
import com.wisnumkt.capstone1.ui.theme.Capstone1Theme

@Composable
fun Search(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollState)
    ) {
        MainTopBar()
        Filter()
        RekomendList()
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    Capstone1Theme {
        Search()
    }
}