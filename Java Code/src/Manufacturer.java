public class Manufacturer
{
  private int manufacturer_id;
  private String name;
  private int phone;
  private String email;
  private String city_name;
  private int postal_code;
  private String country_name;

  public Manufacturer(int manufacturer_id, String name, int phone, String email,
      String city_name, int postal_code, String country_name)
  {
    this.manufacturer_id = manufacturer_id;
    this.name = name;
    this.phone = phone;
    this.email = email;
    this.city_name = city_name;
    this.postal_code = postal_code;
    this.country_name = country_name;
  }

  public int getManufacturer_id()
  {
    return manufacturer_id;
  }

  public void setManufacturer_id(int manufacturer_id)
  {
    this.manufacturer_id = manufacturer_id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getPhone()
  {
    return phone;
  }

  public void setPhone(int phone)
  {
    this.phone = phone;
  }

  public String getEmail()
  {
    return email;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public String getCity_name()
  {
    return city_name;
  }

  public void setCity_name(String city_name)
  {
    this.city_name = city_name;
  }

  public int getPostal_code()
  {
    return postal_code;
  }

  public void setPostal_code(int postal_code)
  {
    this.postal_code = postal_code;
  }

  public String getCountry_name()
  {
    return country_name;
  }

  public void setCountry_name(String country_name)
  {
    this.country_name = country_name;
  }
}


