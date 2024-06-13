from lxml import etree

xml_file = "books.xml"
xsd_file = "books.xsd"

xmlschema_doc = etree.parse(xsd_file)
xmlschema = etree.XMLSchema(xmlschema_doc)

xml_doc = etree.parse(xml_file)

if xmlschema.validate(xml_doc):
    print("XML is valid against XSD.")
else:
    print("XML is not valid against XSD.")
    print(xmlschema.error_log)