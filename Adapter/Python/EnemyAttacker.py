from abc import ABC, abstractmethod


class EnemyAttacker(ABC):

    @abstractmethod
    def make_damage(self):
        pass

    @abstractmethod
    def make_move(self):
        pass

    @abstractmethod
    def set_name(self, name):
        pass
