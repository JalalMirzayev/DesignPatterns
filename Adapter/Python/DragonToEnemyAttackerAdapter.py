from adapter.EnemyAttacker import EnemyAttacker


class DragonToEnemyAttackerAdapter(EnemyAttacker):

    def __init__(self, dragon):
        self.dragon = dragon

    def make_damage(self):
        self.dragon.spit_fire()

    def make_move(self):
        self.dragon.fly()

    def set_name(self, name):
        self.dragon.set_dragon_name(name)
