
from my_module import Person

def test_is_teenager_true():
    person = Person("Alice", 16)
    assert person.is_teenager() is True

def test_is_teenager_false():
    person = Person("Bob", 25)
    assert person.is_teenager() is False
