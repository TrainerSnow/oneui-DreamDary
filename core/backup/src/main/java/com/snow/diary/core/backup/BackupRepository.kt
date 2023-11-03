package com.snow.diary.core.backup

import com.snow.diary.core.backup.model.BackupCreationResult
import com.snow.diary.core.backup.model.BackupInfo
import com.snow.diary.core.backup.model.BackupLoadingResult

interface BackupRepository {

    suspend fun createBackup(): BackupCreationResult


    suspend fun loadBackup(backup: BackupInfo): BackupLoadingResult


    suspend fun getAll(): List<BackupInfo>

    suspend fun delete(backup: BackupInfo)

}