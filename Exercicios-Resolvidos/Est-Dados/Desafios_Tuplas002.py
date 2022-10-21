times = ('Atlético-MG', 'Flamengo', 'Palmeiras', 'Corinthians', 'Fortaleza',
         'Bragantino', 'Fluminense', 'Internacional', 'Ceará', 'América-MG',
         'Cuiabá', 'Santos', 'Athlético-PR', 'São Paulo', 'Atlético-GO',
         'Juventude', 'Bahia', 'Grêmio', 'Sport', 'Chapecoense')

print('-=' * 15)
print(f'Lista de times do Brasileirão: {times}')
print('-=' * 15)
print(f'Os 5 primeiros são: {times[0:5]}')
print('-=' * 15)
print(f'Os 4 últimos são: {times[-4:]}') # ou {times[16:]}
print('-=' * 15)
print(f'Times em órdem alfabética: {sorted(times)}')
print('-=' * 15)
print(f'A chapecoense está na {times.index("Chapecoense") + 1}ª posição.')
print('-=' * 15)