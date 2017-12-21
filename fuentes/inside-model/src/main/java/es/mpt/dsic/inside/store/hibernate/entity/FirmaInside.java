/* Copyright (C) 2016 MINHAP, Gobierno de España
   This program is licensed and may be used, modified and redistributed under the terms
   of the European Public License (EUPL), either version 1.1 or (at your
   option) any later version as soon as they are approved by the European Commission.
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
   or implied. See the License for the specific language governing permissions and
   more details.
   You should have received a copy of the EUPL1.1 license
   along with this program; if not, you may find it at
   http://joinup.ec.europa.eu/software/page/eupl/licence-eupl */

package es.mpt.dsic.inside.store.hibernate.entity;

// Generated 28-ago-2012 18:17:29 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import es.mpt.dsic.inside.util.InsideUtils;

/**
 * FirmaInside generated by hbm2java
 */
@Entity
@Table(name = "FirmaInside")
public class FirmaInside implements java.io.Serializable {

	private Integer id;
	private Date timestamp;
	private String tipoFirma;
	private String identificadorRepositorio;
	private String valorCsv;
	private String regulacionCsv;
	private String tipoMime;
	private String referencia;
	private Boolean signature;
	private String identificadorEnDocumento;
	private Integer orden;
	private byte[] contenido;
	private Set<DocumentoInsideFirmas> documentoInsideFirmases = new HashSet<DocumentoInsideFirmas>(
			0);
	private Set<ExpedienteInsideIndiceFirmas> expedienteInsideIndiceFirmases = new HashSet<ExpedienteInsideIndiceFirmas>(
			0);

	public FirmaInside() {
	}

	public FirmaInside(String tipoFirma) {
		this.tipoFirma = tipoFirma;
	}

	public FirmaInside(String tipoFirma, String identificadorRepositorio,
			String valorCsv, String regulacionCsv, String tipoMime,
			String referencia, Boolean signature,
			String identificadorEnDocumento, Integer orden,
			Set<DocumentoInsideFirmas> documentoInsideFirmases,
			Set<ExpedienteInsideIndiceFirmas> expedienteInsideIndiceFirmases) {
		this.tipoFirma = tipoFirma;
		this.identificadorRepositorio = identificadorRepositorio;
		this.valorCsv = valorCsv;
		this.regulacionCsv = regulacionCsv;
		this.tipoMime = tipoMime;
		this.referencia = referencia;
		this.signature = signature;
		this.identificadorEnDocumento = identificadorEnDocumento;
		this.orden = orden;
		this.documentoInsideFirmases = documentoInsideFirmases;
		this.expedienteInsideIndiceFirmases = expedienteInsideIndiceFirmases;
	}

	@Id
	//@GeneratedValue(strategy = IDENTITY)
	@TableGenerator(name = "GeneradorPk_FirmaInside",
    		table = "GeneradorClaves",
    		pkColumnName = "GenName",
    		valueColumnName = "GenValue",
    		pkColumnValue = "GEN_FirmaInside",
    		allocationSize=1)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "GeneradorPk_FirmaInside")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestamp", length = 19)
	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Column(name = "tipoFirma", nullable = false)
	public String getTipoFirma() {
		return this.tipoFirma;
	}

	public void setTipoFirma(String tipoFirma) {
		this.tipoFirma = tipoFirma;
	}

	@Column(name = "identificadorRepositorio")
	public String getIdentificadorRepositorio() {
		return this.identificadorRepositorio;
	}

	public void setIdentificadorRepositorio(String identificadorRepositorio) {
		this.identificadorRepositorio = identificadorRepositorio;
	}

	@Column(name = "valorCSV")
	public String getValorCsv() {
		return this.valorCsv;
	}

	public void setValorCsv(String valorCsv) {
		this.valorCsv = valorCsv;
	}

	@Column(name = "regulacionCSV")
	public String getRegulacionCsv() {
		return this.regulacionCsv;
	}

	public void setRegulacionCsv(String regulacionCsv) {
		this.regulacionCsv = regulacionCsv;
	}

	@Column(name = "tipoMime")
	public String getTipoMime() {
		return this.tipoMime;
	}

	public void setTipoMime(String tipoMime) {
		this.tipoMime = tipoMime;
	}

	@Column(name = "referencia")
	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	@Column(name = "signature")
	public Boolean getSignature() {
		return this.signature;
	}

	public void setSignature(Boolean signature) {
		this.signature = signature;
	}

	@Column(name = "identificadorEnDocumento")
	public String getIdentificadorEnDocumento() {
		return this.identificadorEnDocumento;
	}

	public void setIdentificadorEnDocumento(String identificadorEnDocumento) {
		this.identificadorEnDocumento = identificadorEnDocumento;
	}

	@Column(name = "orden")
	public Integer getOrden() {
		return this.orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	
	@Column(name = "contenido", nullable = true)
	@Lob
	public byte[] getContenido() {
		return this.contenido;
	}

	public void setContenido(byte[] contenido) {
		this.contenido = contenido;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "firmaInside")
	public Set<DocumentoInsideFirmas> getDocumentoInsideFirmases() {
		return this.documentoInsideFirmases;
	}

	public void setDocumentoInsideFirmases(
			Set<DocumentoInsideFirmas> documentoInsideFirmases) {
		this.documentoInsideFirmases = documentoInsideFirmases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "firmaInside")
	public Set<ExpedienteInsideIndiceFirmas> getExpedienteInsideIndiceFirmases() {
		return this.expedienteInsideIndiceFirmases;
	}

	public void setExpedienteInsideIndiceFirmases(
			Set<ExpedienteInsideIndiceFirmas> expedienteInsideIndiceFirmases) {
		this.expedienteInsideIndiceFirmases = expedienteInsideIndiceFirmases;
	}

	@Override
	public String toString () {
		StringBuffer sb = new StringBuffer ("Entity FirmaInside=[");
		String coma = ", ";
		sb.append("id=" + id + coma);
		sb.append("timestamp=" + InsideUtils.dateToStringISO8601(timestamp) + coma);
		sb.append("tipoFirma=" + tipoFirma + coma);
		sb.append("identificadorRepositorio=" + identificadorRepositorio + coma);
		sb.append("valorCsv=" + valorCsv + coma);
		sb.append("regulacionCsv=" + regulacionCsv + coma);
		sb.append("tipoMime=" + tipoMime + coma);
		sb.append("referencia=" + referencia + coma);
		sb.append("signature=" + signature + coma);
		sb.append("identificadorEnDocumento=" + identificadorEnDocumento + coma);
		sb.append("orden=" + orden);
		sb.append("]");
		return sb.toString();				
	}
}