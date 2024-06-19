###Abstract Factory Pattern Structure
#####1) Abstract Factory:
 Declares an interface for creating abstract product objects.

```
public interface ComponentFactory {
	Button createButton();
	Checkbox createCheckBox();
}
```

#####2) Concrete Factory: 
Implements the operations to create concrete product objects.

```
public class MacOsComponentFactoryImpl implements ComponentFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacOsButton();
	}

	@Override
	public Checkbox createCheckBox() {
		// TODO Auto-generated method stub
		return new MasOsCheckbox();
	}

}
```

 
 
 

#####3) Abstract Product:
Declares an interface for a type of product object.

```
public interface Button {
	public void render();
}

public interface Checkbox {
	public void render();
}
```
#####4) Concrete Product: 
Implements the abstract product interface.

```
public class MacOsButton implements Button {
	@Override
	public void render() {
		System.out.println("MacOsButton rendered");
	}
}

public class WindowsButton implements Button {
	@Override
	public void render() {
		System.out.println("WindowsButton rendered");
	}
}

public class MasOsCheckbox implements Checkbox{
	@Override
	public void render() {
		System.out.println("MasOsCheckbox rendered");
	}
}

public class WindowsCheckbox  implements Checkbox{
	@Override
	public void render() {
		System.out.println("WindowsCheckbox rendered");
	}
}

```
#####5) Client: 
Uses the interfaces declared by the abstract factory and abstract product classes.

```
CustomUIManager manager = new CustomUIManager(new MacOsComponentFactoryImpl());
Button btn = manager.getButton();
System.out.println(btn instanceof MacOsButton);
System.out.println(btn instanceof WindowsButton);
```

##### Use Cases for Abstract Factory Pattern

```
Cross-platform UI Libraries
Theming and Skinning Engines
Plugin Architecture
```