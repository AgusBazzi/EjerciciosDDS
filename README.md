# Ejercicios DDS

Conjunto de Ejercicios para Diseño de Sistemas

**Grupo 5**:
- Bazzi Agustín
- Goncalves Pablo
- Huang Steven
- Molina Nicolás
- Seoane Carolina
- Vergé Facundo

---

## Cómo Usar

### • Nota: No commitear (ni pushear) nada en la rama main hasta que se termine el ejercicio


**Para agregar un ejercicio:**
1. Clonar o pullear el repo según corresponda
2. En la consola de git bash, utilizar `git switch -c EjercicioX` que crea y te mueve a una nueva rama (antes de hacer nada, por precaución)
3. En el repo existe una carpeta *ProyectoBase* que se usa como template. Hacer una copia con el nombre *numEjercicio-Título*
4. Entrar al *pom.xml* y cambiarle el nombre al proyecto donde pone `<artifactId>nombreEnPom</artifactId>` casi arriba de todo
5. Commitear en este punto (es decir con el proyecto vacío)
6. Empezar a trabajar normalmente

**Para cambiar un ejercicio ya en main:**
1. Repetir pasos 1 y 2 de la sección anterior
2. Trabajar normalmente sobre el ejercicio

**Una vez terminado el ejercicio:**
1. Asegurarse que está todo commiteado
2. Pushear al repo con `git push -u origin EjercicioX`
3. Hacer un pull request a main desde GitHub
4. Borrar la rama del ejercicio
5. Listo :)
---
## Proyecto Base

En ProyectoBase hay 3 cosas:
* La carpeta src/
* El pom.xml
* Un .gitignore

Como git no sigue directorios vacíos (que sería el caso de src/), existen archivos llamados .gitkeep en los directorios finales dentro de src/. Estos archivos no son nada (ni siquiera son algo de git como .gitignore), pero por "convención" se los crea para solucionar ese tema.
Entonces, cuando creen archivos en estas carpetas, pueden (y sería mejor) borrarlos. Ya no serían necesarios.

No tengo nada que decir sobre el pom. Lo único, acuérdense de cambiar la parte donde pone el nombre del proyecto en `<artifactId>nombreEnPom</artifactId>` arriba de las *properties* en las primeras líneas.

En el .gitignore agregar cualquier archivo que se genere al compilar/buildear el proyecto (o lo que fuese).  
Inicialmente, tiene:  
• La carpeta *target/* que se crea cuando se buildea el proyecto (y por esa razón no es necesaria)  
• La carpeta *.idea/* que es configuración del IDE IntelliJ Idea (que sí se necesita, pero a su vez el IDE la autogenera al abrir el proyecto, así que no en el repo)  
• La imagen del proyecto *\*.iml* (que al igual que lo anterior, el IDE lo autogenera por lo que no lo subimos al repo)  
• Cualquier archivo de compilación *\*.class*   
• Cualquier archivo de log *\*.log* 
