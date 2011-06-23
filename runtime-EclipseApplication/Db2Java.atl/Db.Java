<?xml version="1.0" encoding="ISO-8859-1"?>
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:Java="platform:/resource/MDA_ATL_UWE/Metamodel/Java.ecore">
  <Java:Class name="Person">
    <members xsi:type="Java:Field" name="pID" type="/2"/>
    <members xsi:type="Java:Field" name="pName" type="/3"/>
    <members xsi:type="Java:Field" name="pAddressID" type="/2"/>
    <members xsi:type="Java:Field" name="pBirthday" type="/4"/>
    <members xsi:type="Java:Field" name="pXFactor" type="/5"/>
  </Java:Class>
  <Java:Class name="Address">
    <members xsi:type="Java:Field" name="aID" type="/2"/>
    <members xsi:type="Java:Field" name="aCity" type="/3"/>
    <members xsi:type="Java:Field" name="aAreaCode" type="/2"/>
  </Java:Class>
  <Java:PrimitiveType name="Int"/>
  <Java:PrimitiveType name="String"/>
  <Java:PrimitiveType name="Date"/>
  <Java:PrimitiveType name="Float"/>
</xmi:XMI>
