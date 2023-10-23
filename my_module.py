class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def is_teenager(self):
        return 13 <= self.age <= 19

# Usage
if __name__ == "__main__":
    person1 = Person("Alice", 25)
    person2 = Person("Bob", 16)

    print(f"{person1.name} is a teenager: {person1.is_teenager()}")
    print(f"{person2.name} is a teenager: {person2.is_teenager()}")
