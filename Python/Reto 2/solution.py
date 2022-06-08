# POR FAVOR LEA TODAS LAS INDICACIONES SUMINISTRADAS EN EL 
# ENUNCIADO ANTES DE EMPEZAR A IMPLEMENTAR SU SOLUCIÓN

pensum = [
    {'0123':
        {
        'nombre': 'intro a la ing',
        'créditos': 2
        },
    '4567':
        {
        'nombre': 'inglés',
        'créditos': 1
        }
    },  #semestre 1
    {}, #semestre 2
    {}  #semestre 3
]

# NO MODIFICAR EL NOMBRE, PARÁMETROS O RETORNO DE LA FUNCIÓN
def modificar_materia(pensum, semestre, materia, nombre, creditos):
    # ACÁ INICIA LA FUNCIÓN modificar_materia (En este espacio debes 
    # poner el código necesario para implementar esta funcionalidad)
    
    # validar que el número del semestre donde está la materia que el usuario desea modificar si corresponde a un semestre
    validar_semestre=len(pensum)
    if semestre == 0:
        mensaje="Ingrese un semestre válido"
    elif semestre > validar_semestre:
        mensaje="Ingrese un semestre válido"
    else:
        #validar que el semestre que se desea modificar no este vacío
        validar_no_materias=0
        for test in pensum[semestre-1]:
            validar_no_materias=validar_no_materias+1
        if validar_no_materias == 0:
            mensaje="El semestre no tiene materias"
        else:
            #modificar materia
            for validar_materia, cambiar_nombre in pensum[0].items():
                if validar_materia == materia:
                    cambiar_nombre['nombre']="lectoescritura"
                    cambiar_nombre['créditos']=3
                    mensaje="Modificada con éxito"
                    break
                else:
                    mensaje="La materia no existe"
    # ACÁ TERMINA LA FUNCIÓN modificar_materia
    # NO MODIFIQUES LA SIGUIENTE LÍNEA
    return mensaje
