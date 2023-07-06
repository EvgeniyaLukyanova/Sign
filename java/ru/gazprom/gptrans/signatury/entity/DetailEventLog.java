package ru.gazprom.gptrans.signatury.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "SIGN_DETAIL_EVENT_LOG", indexes = {
        @Index(name = "IDX_SIGN_DETAIL_EVENT_LOG_EVENT_LOG", columnList = "EVENT_LOG_ID"),
        @Index(name = "IDX_SIGN_DETAIL_EVENT_LOG_DOC_TYPE", columnList = "DOC_TYPE_ID")
})
@Entity(name = "sign_DetailEventLog")
public class DetailEventLog {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "EVENT_LOG_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private EventLog eventLog;

    @Column(name = "DOC_ID")
    private Integer docId;

    @JoinColumn(name = "DOC_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private DocType docType;

    public DocType getDocType() {
        return docType;
    }

    public void setDocType(DocType docType) {
        this.docType = docType;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public EventLog getEventLog() {
        return eventLog;
    }

    public void setEventLog(EventLog eventLog) {
        this.eventLog = eventLog;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}