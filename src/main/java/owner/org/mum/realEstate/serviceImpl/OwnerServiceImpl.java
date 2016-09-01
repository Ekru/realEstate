package owner.org.mum.realEstate.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import owner.org.mum.realEstate.DAO.OwnerDAO;
import owner.org.mum.realEstate.domain.Owner;
import owner.org.mum.realEstate.service.OwnerService;
@Service
public class OwnerServiceImpl implements OwnerService {
	
	@PersistenceContext
	private EntityManager em;
	@Autowired
	private OwnerDAO ownerDAO;
	
	@Transactional
	public void addNewOwner(Owner owner) {
		
		ownerDAO.save(owner);
		
	}

	@Transactional
	public void deleteOwnerById(int ownerId) {
		
		ownerDAO.delete(ownerId);
	}

	@Transactional
	public void editOwnerById(int id) {
		
		//ownerDAO.editOwner(id);
	}

	
	public Owner getOwnerById(int id) {
		
		return ownerDAO.findOne(id);
	}

	
	public Owner getOwnerByName(String name) {
		TypedQuery<Owner> query = em.createQuery("select o from Owner o where o.lastName = ?1", Owner.class);
		query.setParameter(1, name);
		return query.getSingleResult();
	}

	
	public List<Owner> getOwners() {		
		return ownerDAO.findAll();
	}

	}
