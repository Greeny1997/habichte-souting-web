package de.jinou.habichtescouting.dto;

import java.util.Objects;

/**
 * Spieler
 */

public class Spieler   {
  private Long id = null;

  private Long spielernummer = null;

  private String name = null;

  private String position = null;

  private String verein = null;

  private String beschreibung = null;

  private Long angelegtAm = null;

  public Spieler id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Spieler spielernummer(Long spielernummer) {
    this.spielernummer = spielernummer;
    return this;
  }

  /**
   * Get spielernummer
   * @return spielernummer
  **/

  public Long getSpielernummer() {
    return spielernummer;
  }

  public void setSpielernummer(Long spielernummer) {
    this.spielernummer = spielernummer;
  }

  public Spieler name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Spieler position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  **/

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Spieler verein(String verein) {
    this.verein = verein;
    return this;
  }

  /**
   * Get verein
   * @return verein
  **/

  public String getVerein() {
    return verein;
  }

  public void setVerein(String verein) {
    this.verein = verein;
  }

  public Spieler beschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
    return this;
  }

  /**
   * Get beschreibung
   * @return beschreibung
  **/

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  public Spieler angelegtAm(Long angelegtAm) {
    this.angelegtAm = angelegtAm;
    return this;
  }

  /**
   * Get angelegtAm
   * @return angelegtAm
  **/

  public Long getAngelegtAm() {
    return angelegtAm;
  }

  public void setAngelegtAm(Long angelegtAm) {
    this.angelegtAm = angelegtAm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spieler spieler = (Spieler) o;
    return Objects.equals(this.id, spieler.id) &&
        Objects.equals(this.spielernummer, spieler.spielernummer) &&
        Objects.equals(this.name, spieler.name) &&
        Objects.equals(this.position, spieler.position) &&
        Objects.equals(this.verein, spieler.verein) &&
        Objects.equals(this.beschreibung, spieler.beschreibung) &&
        Objects.equals(this.angelegtAm, spieler.angelegtAm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, spielernummer, name, position, verein, beschreibung, angelegtAm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spieler {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    spielernummer: ").append(toIndentedString(spielernummer)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    verein: ").append(toIndentedString(verein)).append("\n");
    sb.append("    beschreibung: ").append(toIndentedString(beschreibung)).append("\n");
    sb.append("    angelegtAm: ").append(toIndentedString(angelegtAm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

