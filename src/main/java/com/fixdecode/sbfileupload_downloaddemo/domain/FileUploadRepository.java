package com.fixdecode.sbfileupload_downloaddemo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FileUploadRepository extends JpaRepository< FileUpload , String > {
}
