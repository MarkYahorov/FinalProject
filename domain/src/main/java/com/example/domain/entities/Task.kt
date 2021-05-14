package com.example.domain.entities

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Task(
    val id: Int,
    val title: String,
    val icon: Int,
    val color: Int,
    val number: String?,
    val rememberTime: Int,
    val categoryId: Int,
    val typeOfTaskId: Int
): Parcelable
