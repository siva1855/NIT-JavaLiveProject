package siva.nit.dao;

import java.util.List;

import siva.nit.model.Part;

public interface PartDao {

	public Integer savePart(Part part);

	public List<Part> getAllParts();

	public void delectPart(Integer id);

	public Part getOnePart(Integer id);

	public void updatePart(Part part);

}
