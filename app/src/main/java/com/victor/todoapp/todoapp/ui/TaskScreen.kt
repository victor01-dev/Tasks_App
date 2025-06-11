package com.victor.todoapp.todoapp.ui

import android.app.Dialog
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Dialog

@Composable
fun TaskScreen(modifier: Modifier, taskViewModel: TaskViewModel) {
    Box(modifier = Modifier.fillMaxSize()) {
        FabDialog(Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun FabDialog(modifier: Modifier) {
    FloatingActionButton(onClick = {
        //mostrar dialogo
    }, modifier = modifier) {
        Icon(Icons.Filled.Add, contentDescription = "")
    }
}

@Composable
fun AddTaskDialog(
    show: Boolean,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    if (show) {
        Dialog(
            onDismissRequest = onDismiss
        ) {
            Column(
                modifier = modifier.fillMaxSize()
            ) {
                // Your dialog content goes here
            }
        }
    }
}