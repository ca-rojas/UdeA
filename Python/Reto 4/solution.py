def limpiar(cuento_lista):
    '''Funcion para elimininar simbolos nos deseados de la lista original. Retorna una nueva lista de listas'''
    simbolos =['-','¿','?','.',',','¡','!',':','"','–']
    nuevo_cuento = []
    for palabra in cuento_lista:
        new_palabra = palabra 
        for simbolo in simbolos:
            new_palabra = new_palabra.replace(simbolo, '')
        if len(new_palabra) > 0:
            nuevo_cuento.append(new_palabra)
    return nuevo_cuento

def top_valores(nuevo_cuento):
    '''Funcion para sacar el top 20 de palabras. Recibe y devuelve una lista de listas'''
    x =0
    dicc_palabras = {}
    lista_ordenada = []
    for contar in nuevo_cuento:
        total = nuevo_cuento.count(contar)
        dicc_palabras[contar] = total
    salida = dict(sorted(dicc_palabras.items(), key=lambda item: item[1], reverse=True))
    for i, j in salida.items():
        if x < 20:
            lista_ordenada.append([i,j])
            x += 1
    return lista_ordenada

def main(lista_texto):
    # ACÁ INICIA LA FUNCIÓN main
    cuento = limpiar(lista_texto)
    lista_conteo = top_valores(cuento)
    # ACÁ TERMINA LA FUNCIÓN main
    # NO MODIFICAR LA SIGUIENTE LÍNEA
    return lista_conteo