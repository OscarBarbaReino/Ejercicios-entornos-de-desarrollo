# AE-2. CONTROL DE VERSIONES CON GIT Y GITHUB

## ÍNDICE

1. Componentes del equipo.
2. Labores de cada integrante.
3. Decisiones tomadas.
4. URL del reposito GitHub compartido.

### 1. COMPONENTES DEL EQUIPO

- Adrián Fernández
- Isaac Calderón
- Marcos Sanda
- Óscar Barba

### 2. LABORES DE CADA INTEGRANTE

- <b>Adrián Fernández:</b> Creación de un nuevo repositorio remoto en GitHub para el equipo donde todos 
puedan ir aportando el trabajo realizado durante la actividad, implementación del código de la 
clase suma, implementación parcial del código de la clase main.  
  
- <b>Isaac Calderón:</b> Implementación del código de la clase resta y implementación parcial del código
de la clase main.  

- <b>Marcos Sanda:</b> Implementación del código de la clase potencia y implementación parcial del código
de la clase main.  

- <b>Óscar Barba:</b> Implementación del código de la clase división y implementación parcial del código
de la clase main.  

### 3. DECISIONES TOMADAS

Primero de todo Adrián creo un repositorio local en su PC, creó un repositorio remoto en GitHub, y 
vinculó estos dos para poder trabajar con ello, acto siguiente envió una invitación de colaborador
a todos los integrantes del grupo para que ellos pudieran clonar ese repositorio y actualizarlo.  

Cada uno de los integrantes después de tener clonado el repositorio se creó una rama propia para
cada clase, y implementó el código en esa clase para después con la ayuda de un git add y git commit
actualizar esa clase y con un git push subirla al repositorio remoto, así pueden ver todos los 
colaboradores todas las ramas actualizadas.  

Una vez hecho esto, cada uno de los integrantes del equipo desde la clase main propia en su PC 
realizó un git merge de la rama main con su rama propia, con lo que nos encontramos fué que al unico 
que le dejaba hacer git merge "automático" y que reflejara en el repositorio remoto fué a Adrián
porque es el "creador" del repositorio, y al tener el repositorio en privado para solo nosotros
poder acceder a el, no dejaba hacer auto-merge de los colaboradores, investigando vimos que solo 
se le puede dar permisos de "write" en los repositorios de organizaciones o teniendo la versión Pro de GitHub, la alternativa
que nosotros hemos encontrado a esto fué a través de la plataforma GitHub dentro del repositorio
crear una "Pull request" de cada rama al main, y el creador del repositorio verificarla y aceptarla.
Hecho esto se implementaron las ramas al main sin ningun problema.

Para la elaboración del main, decidimos reunirnos telemáticamente para completar el código todos 
juntos y a parte revisar el proyecto entero.  

### 4. URL DEL REPOSITORIO GITHUB COMPARTIDO

[Repositorio remoto del equipo](https://github.com/addryx/workspace-entornosdedesarrollo-grupo)