package jkind.excel;

import java.util.List;

/**
 * This class is used to configure the layout signals in counterexamples
 */
public interface Layout {
	/**
	 * Return the list of categories to use, in the order desired
	 * 
	 * For example, this might return ["Inputs", "Outputs", "Locals"]
	 */
	public List<String> getCategories();

	/**
	 * Get the category for a specific signal
	 * 
	 * @param signal
	 *            name of the signal
	 * @return the category to which the signal belongs, or <code>null</code> if
	 *         the signal should be ignored
	 */
	public String getCategory(String signal);
}
