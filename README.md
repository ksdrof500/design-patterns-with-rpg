# Design Patterns In Kotlin

Project Inspired by [@dbacinski](https://github.com/dbacinski/Design-Patterns-In-Kotlin) (Dariusz Baciński)

## Table of Contents

* [Behavioral Patterns](#behavioral)
	* [Observer / Listener](#observer--listener)
	* [Strategy](#strategy)
	* [Command](#command)
	* [State](#state)
	* [Chain of Responsibility](#chain-of-responsibility)
	* [Visitor](#visitor)
	* [Mediator](#mediator)
	* [Memento](#memento)
* [Creational Patterns](#creational)
	* [Builder / Assembler](#builder--assembler)
	* [Factory Method](#factory-method)
	* [Singleton](#singleton)
	* [Abstract Factory](#abstract-factory)
* [Structural Patterns](#structural)
	* [Adapter](#adapter)
	* [Decorator](#decorator)
	* [Facade](#facade)
	* [Protection Proxy](#protection-proxy)
	* [Composite](#composite)

Behavioral
==========

>In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.
>
>**Source:** [wikipedia.org](http://en.wikipedia.org/wiki/Behavioral_pattern)

[Observer / Listener](/patterns/src/test/kotlin/Listener.kt)
--------

The observer pattern is used to allow an object to publish changes to its state.
Other objects subscribe to be immediately notified of any changes.


[Strategy](/patterns/src/test/kotlin/Strategy.kt)
-----------

The strategy pattern is used to create an interchangeable family of algorithms from which the required process is chosen at run-time.


[Command](/patterns/src/test/kotlin/Command.kt)
-------

The command pattern is used to express a request, including the call to be made and all of its required parameters, in a command object. The command may then be executed immediately or held for later use.


[State](/patterns/src/test/kotlin/State.kt)
------

The state pattern is used to alter the behaviour of an object as its internal state changes.
The pattern allows the class for an object to apparently change at run-time.


[Chain of Responsibility](/patterns/src/test/kotlin/ChainOfResponsibility.kt)
-----------------------

The chain of responsibility pattern is used to process varied requests, each of which may be dealt with by a different handler.


[Visitor](/patterns/src/test/kotlin/Visitor.kt)
-------

The visitor pattern is used to separate a relatively complex set of structured data classes from the functionality that may be performed upon the data that they hold.


[Mediator](/patterns/src/test/kotlin/Mediator.kt)
-------

Mediator design pattern is used to provide a centralized communication medium between different objects in a system. This pattern is very helpful in an enterprise application where multiple objects are interacting with each other.


[Memento](/patterns/src/test/kotlin/Memento.kt)
-------

The memento pattern is a software design pattern that provides the ability to restore an object to its previous state (undo via rollback).



Creational
==========

> In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.
>
>**Source:** [wikipedia.org](http://en.wikipedia.org/wiki/Creational_pattern)

[Builder / Assembler](/patterns/src/test/kotlin/Builder.kt)
----------

The builder pattern is used to create complex objects with constituent parts that must be created in the same order or using a specific algorithm.
An external class controls the construction algorithm.


[Factory Method](/patterns/src/test/kotlin/FactoryMethod.kt)
-----------------

The factory pattern is used to replace class constructors, abstracting the process of object generation so that the type of the object instantiated can be determined at run-time.


[Singleton](/patterns/src/test/kotlin/Singleton.kt)
------------

The singleton pattern ensures that only one object of a particular class is ever created.
All further references to objects of the singleton class refer to the same underlying instance.
There are very few applications, do not overuse this pattern!


[Abstract Factory](/patterns/src/test/kotlin/AbstractFactory.kt)
-------------------

The abstract factory pattern is used to provide a client with a set of related or dependant objects.
The "family" of objects created by the factory are determined at run-time.



Structural
==========

>In software engineering, structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities.
>
>**Source:** [wikipedia.org](http://en.wikipedia.org/wiki/Structural_pattern)

[Adapter](/patterns/src/test/kotlin/Adapter.kt)
----------

The adapter pattern is used to provide a link between two otherwise incompatible types by wrapping the "adaptee" with a class that supports the interface required by the client.


[Decorator](/patterns/src/test/kotlin/Decorator.kt)
------------

The decorator pattern is used to extend or alter the functionality of objects at run-time by wrapping them in an object of a decorator class.
This provides a flexible alternative to using inheritance to modify behaviour.


[Facade](/patterns/src/test/kotlin/Facade.kt)
---------

The facade pattern is used to define a simplified interface to a more complex subsystem.


[Protection Proxy](/patterns/src/test/kotlin/ProtectionProxy.kt)
------------------

The proxy pattern is used to provide a surrogate or placeholder object, which references an underlying object.
Protection proxy is restricting access.


[Composite](/patterns/src/test/kotlin/Composite.kt)
------------------

The composite pattern is used to compose zero-or-more similar 
objects so that they can be manipulated as one object.


Info
====

Descriptions from: [Gang of Four Design Patterns Reference Sheet](http://www.blackwasp.co.uk/GangOfFour.aspx)
