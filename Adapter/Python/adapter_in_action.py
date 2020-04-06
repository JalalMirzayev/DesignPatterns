from adapter.DragonToEnemyAttackerAdapter import DragonToEnemyAttackerAdapter
from adapter.Solider import Solider
from adapter.Dragon import Dragon

print("Solider")
peter = Solider()
peter.make_damage()
peter.make_move()
peter.set_name("Peter")


print("Dragon")
dragon = Dragon()
dragon.spit_fire()
dragon.fly()
dragon.set_dragon_name("Theodor")

print("Dragon")
adapter = DragonToEnemyAttackerAdapter(dragon)
adapter.make_damage()
adapter.make_move()
adapter.set_name("Theodor")
