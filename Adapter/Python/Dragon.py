import random


class Dragon:
    
    def spit_fire(self):
        print(f"Dragon does {random.randint(0, 10)} damage by spitting fire.")

    def fly(self):
        print(f"Dragon flies {random.randint(0, 10)} steps forward.")

    def set_dragon_name(self, name):
        print(f"The dragon is called {name}")
