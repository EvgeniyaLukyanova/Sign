package ru.gazprom.gptrans.signatury.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "SIGN_MANUAL_SIGN")
@Entity(name = "sign_ManualSign")
public class ManualSign {

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DOCUMENT_ID")
    private Long documentId;

    @Column(name = "FILE")
    @Lob
    private String file;

    @Column(name = "RECEIVED_DATE")
    private LocalDateTime receivedDate;

    @Column(name = "SIGNED_DATE")
    private LocalDateTime signedDate;

    @Column(name = "USER_RECEIVED")
    private String userReceived;

    @Column(name = "USER_SIGNED")
    private String userSigned;

    public String getUserSigned() {
        return userSigned;
    }

    public void setUserSigned(String userSigned) {
        this.userSigned = userSigned;
    }

    public String getUserReceived() {
        return userReceived;
    }

    public void setUserReceived(String userReceived) {
        this.userReceived = userReceived;
    }

    public LocalDateTime getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(LocalDateTime signedDate) {
        this.signedDate = signedDate;
    }

    public LocalDateTime getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDateTime receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Long getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Long documentId) {
        this.documentId = documentId;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}