/*
 * Copyright (C) 2016 MINHAP, Gobierno de España This program is licensed and may be used, modified
 * and redistributed under the terms of the European Public License (EUPL), either version 1.1 or
 * (at your option) any later version as soon as they are approved by the European Commission.
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and more details. You
 * should have received a copy of the EUPL1.1 license along with this program; if not, you may find
 * it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */


package csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model.contenido;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model.contenido
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _ContenidoMtom_QNAME =
      new QName("http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido/mtom",
          "contenidoMtom");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: csvstorage.es.gob.aapp.csvstorage.webservices.documentmtom.v1.model.contenido
   * 
   */
  public ObjectFactory() {}

  /**
   * Create an instance of {@link TipoContenidoMtom }
   * 
   */
  public TipoContenidoMtom createTipoContenidoMtom() {
    return new TipoContenidoMtom();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link TipoContenidoMtom }{@code >}}
   * 
   */
  @XmlElementDecl(
      namespace = "http://administracionelectronica.gob.es/ENI/XSD/v1.0/documento-e/contenido/mtom",
      name = "contenidoMtom")
  public JAXBElement<TipoContenidoMtom> createContenidoMtom(TipoContenidoMtom value) {
    return new JAXBElement<TipoContenidoMtom>(_ContenidoMtom_QNAME, TipoContenidoMtom.class, null,
        value);
  }

}
