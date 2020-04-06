from adapter.EnemyAttacker import EnemyAttacker
import random


class Solider(EnemyAttacker):

    def make_damage(self):
        print(f"Solider inflicts {random.randint(0, 10)} damage points.")

    def make_move(self):
        print(f"Solider moves {random.randint(0, 10)} steps forward.")

    def set_name(self, name):
        print(f"The solider is named {name}.")
