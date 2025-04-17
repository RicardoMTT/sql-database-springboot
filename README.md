**Descripcion**

API para consultar datos de una base de datos que esta desplegado en SQL Database de la nube de azure.

**Dependencias Necesarias**
- MS SQL Server Driver
- Spring JPA
- Spring Web
- Base de datos SQL Azure
- Servidor SQL de Azure

**Observacion**
Para poder autenticarse debe permitir que el servidor SQL solo permita autenticarse mediante SQL authentication,por defecto parece que esta con Azure Active Directory.
Deber permitir el acceso desde una red publicac a tu servidor SQL , ademas en las reglas de firewall agrega una regla para tu ip publica : 

- Nombre: ip-local

- IP inicial: (se autocompleta con tu IP pública actual)

- IP final: igual que la inicial
