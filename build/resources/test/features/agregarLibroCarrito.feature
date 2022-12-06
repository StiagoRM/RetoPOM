#language: es

Característica: Agregar libros carrito

  Antecedentes:
    Dado el usuario se encuentre en la pagina
    Cuando el usuario ingrese los datos

  @LibroCategoria
  Escenario: Agregar libro por categoria
    Dado el usuario entre a la pagina libros
    Cuando el ususario seleccione una categoria
    Y seleccione un libro
    Entonces lo agregara al carrito

  @LibroBusqueda
  Escenario: Agregar libro por busqueda
    Dado el usuario digite el libro
    Cuando le de click al libro
    Entonces se visualiza que lo agrego al carrito