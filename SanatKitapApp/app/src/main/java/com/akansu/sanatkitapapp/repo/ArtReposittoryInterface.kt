package com.akansu.sanatkitapapp.repo

import androidx.lifecycle.LiveData
import com.akansu.sanatkitapapp.model.ImageResponse
import com.akansu.sanatkitapapp.roomdb.Art
import com.akansu.sanatkitapapp.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}