package com.omega.faturamento.entities;

import com.omega.faturamento.enums.EnumStatusNotaFiscal;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;

/**
 *
 * @author ENGCARVALHO
 */

@Data
@Entity
@Table(name = "OMG_NOTAFISCAL")
public class NotaFiscal implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "DH_EMISSAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dhEmissao;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private EnumStatusNotaFiscal enumStatusNotaFiscal;
}
